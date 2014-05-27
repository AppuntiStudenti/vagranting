class jacorb::config
{
  exec {'dos2unix':
    path    => '/bin:/usr/bin',
    cwd     => '/opt/jacorb/etc',
    command => 'dos2unix *properties*',
    require => Package['dos2unix'],
  }

  $orbProperties = '/opt/jacorb/etc/orb.properties'

  augeas { 'orb.properties':
    lens => 'Properties.lns',
    incl => $orbProperties,
    changes => [
      'set ORBInitRef.NameService /opt/jacorb/NS_Ref',
      'set jacorb.naming.ior_filename /opt/jacorb/NS_Ref',
      'set jacorb.imr.ior_file /opt/jacorb/ImR_Ref',
    ],
    require => Exec['dos2unix'],
  } ->
  file { '/usr/lib/jvm/java-7-oracle/lib/orb.properties':
    ensure => present,
    source => $orbProperties,
  }

  $jacorbProperties = '/opt/jacorb/etc/jacorb.properties'

  file { $jacorbProperties:
    ensure => link,
    target => '/opt/jacorb/etc/jacorb-properties.template',
  } ->
  augeas { 'jacorb.properties': 
    lens => 'Properties.lns',
    incl => $jacorbProperties,
    changes => [
      'set ORBInitRef.NameService /opt/jacorb/NS_Ref',
    ],
    require => Exec['dos2unix'],
  }

  exec { 'jacorb-path':
    path => '/bin:/usr/bin',
    command => "sed 's/\"$/:\\/opt\\/jacorb\\/bin\"/' -i /etc/environment",
    unless => 'grep jacorb /etc/environment',
  }

  file { '/opt/jacorb/bin/idl':
    ensure => present,
    source => '/vagrant/vagrant/files/opt/jacorb/bin/idl',
  }
}
