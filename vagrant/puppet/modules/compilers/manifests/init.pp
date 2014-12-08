class compilers
{
  package {[
      'build-essential',
      'clisp',
      'gnat',
      'golang',
      'manpages-dev',
      'mono-complete',
      'scala',
      'swi-prolog-nox',
    ]:
    ensure => installed
  }
}
