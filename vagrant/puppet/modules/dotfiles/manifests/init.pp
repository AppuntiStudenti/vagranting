class dotfiles
{
  exec {'git submodule update -i':
    cwd => '/vagrant',
    path => '/usr/bin:/bin:/usr/local/bin'
  }
}
