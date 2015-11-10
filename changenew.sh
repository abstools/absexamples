#!/bin/csh

foreach i (`find . -name "*.abs"`)
  cat $i | sed s/new\ cog/nglobal/g | sed s/new/nlocal/g | sed s/nglobal/new/g |  sed s/nlocal/new\ local/g > $i.tmp
  mv -f $i.tmp $i
end
