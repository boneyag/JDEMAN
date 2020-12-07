/**
 * @id java/examples/unusedmethod
 * @name Unused private method
 * @description Finds methods that are not accessed
 * @kind problem
 * @tags method
 *       access
 *       private
 */

import java

from Callable callee
where
  not exists(Callable caller | caller.polyCalls(callee)) and
  callee.getCompilationUnit().fromSource() and
  not callee.hasName("<clinit>") and 
  not callee.hasName("Buildconfig") and
  not callee.getName().regexpMatch("get.+") and
  not callee.getName().regexpMatch("set.+")
select callee, "Not called."