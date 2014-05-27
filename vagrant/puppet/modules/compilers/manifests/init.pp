class compilers
{
  package {[
      'build-essential',
      'clisp',
      'gnat',
      'manpages-dev',
      'mono-complete',
      'scala',
      'swi-prolog-nox',
    ]:
    ensure => installed
  }
}
