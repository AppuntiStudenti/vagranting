class jacorb::package
(
  $version = '2.2.4'
)
{
  $dir = "/opt/JacORB-$version"
  $zipfile = "JacORB-$version-binary.zip"

  include wget

  wget::fetch { 'jacorb-binary':
    source      => "http://www.jacorb.org/releases/2.2.4/$zipfile",
    destination => "/opt/$zipfile",
    timeout     => 0,
    verbose     => false,
  } ->
  exec { 'extract':
    path => '/bin:/usr/bin',
    cwd => '/opt/',
    command => "unzip $zipfile",
    creates => $dir,
  } ->
  file { '/opt/jacorb':
    ensure => symlink,
    target => $dir,
    owner => 'vagrant',
    group => 'vagrant',
  } ->
  exec { 'chown':
    path => '/bin:/usr/bin',
    command => 'chown -R vagrant:vagrant /opt/jacorb/'
  }
}
