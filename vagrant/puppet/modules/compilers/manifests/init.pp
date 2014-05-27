class compilers
{
  package {['build-essential', 'manpages-dev', 'gnat', 'swi-prolog-nox', 'clisp']:
    ensure => installed
  }
}
