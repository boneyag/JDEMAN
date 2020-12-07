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
  callee.getCompilationUnit().fromSource()
select callee, "Not called.", callee.getMetrics().getNumberOfLinesOfCode() as lines_of_codes

