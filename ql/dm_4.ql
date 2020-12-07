/**
* @id java/examples/unusedmethod
* @name Unused private method
* @description Finds methods that are not accessed
* @kind problem
*/

import java

predicate interfaceMethod(Callable m){
    exists (Interface i |
        i.getACallable() = m
    )
}

predicate abstractMethod(Callable m){
    exists (Class c |
        c.isAbstract() and c.getACallable() = m
    )
}

from Callable callee
where
  not exists(Callable caller | caller.polyCalls(callee)) and
  callee.getCompilationUnit().fromSource() and
  not callee.hasName("<clinit>") and 
  not callee.hasName("finalize") and
  not callee.hasName("main") and
  not callee.hasName("onCreate") and
  not callee.(Constructor).getNumberOfParameters() = 0 and
  not interfaceMethod(callee) and
  not abstractMethod(callee)
select callee, "Not called.", callee.getMetrics().getNumberOfLinesOfCode() as lines_of_codes
