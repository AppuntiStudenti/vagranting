class versioning
{
  package {[
      'bzr',
      'cvs',
      'git',
      'mercurial',
      'subversion',
    ]:
    ensure => installed
  }
}
