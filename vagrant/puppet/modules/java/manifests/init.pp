class java
{
  include apt

  apt::ppa { 'ppa:webupd8team/java': } ->
  exec { 'accept-license':
    path => '/bin:/usr/bin',
    command => 'echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections',
  } ->
  package { 'oracle-java7-installer':
    ensure => present
  }
}
