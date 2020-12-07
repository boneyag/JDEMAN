/**
* @id java/examples/unusedmethod
* @name Unused private method
* @description Finds methods that are not accessed
* @kind problem
*/

import java

from Callable callee
where
  not exists(Callable caller | caller.polyCalls(callee)) and
  callee.getCompilationUnit().fromSource() and
  not callee.hasName("<clinit>") and 
  not callee.hasName("finalize") and
  not callee.hasName("main") and
  not callee.hasName("onCreate") and
  not callee.(Constructor).getNumberOfParameters() = 0
select callee, "Not called.", callee.getMetrics().getNumberOfLinesOfCode() as lines_of_codes
