class { 'java': } ->
package {['ant', 'maven']:
  ensure => installed
}
package {['unzip', 'dos2unix']:
  ensure => installed
}

package {'nodejs':
  ensure => installed
}

class { 'compilers' : }
class { 'jacorb::package':
  require => Class['java']
} ->
class { 'jacorb::config': }

class { '::ntp':
  servers  => [
    '0.it.pool.ntp.org',
    '1.it.pool.ntp.org',
    '2.it.pool.ntp.org',
    '3.it.pool.ntp.org'
  ],
  restrict => ['127.0.1.1'],
}

class { 'dotfiles':
}
