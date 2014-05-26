package {['openjdk-7-jdk', 'ant']:
  ensure => installed
}
package {'unzip':
  ensure => installed
}

class { 'jacorb::package': } ->
class { 'jacorb::config': }

class { '::ntp':
  servers => [
    '0.it.pool.ntp.org',
    '1.it.pool.ntp.org',
    '2.it.pool.ntp.org',
    '3.it.pool.ntp.org'
  ],
  restrict => ['127.0.1.1'],
}
