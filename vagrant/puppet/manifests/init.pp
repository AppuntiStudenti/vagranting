package {['openjdk-7-jdk', 'ant']:
  ensure => installed
}
package {'unzip':
  ensure => installed
}

include wget
wget::fetch { "jacorb-binary":
  source      => 'http://www.jacorb.org/releases/2.2.4/JacORB-2.2.4-binary.zip',
  destination => '/home/vagrant/JacORB-2.2.4-binary.zip',
  timeout     => 0,
  verbose     => false,
}
