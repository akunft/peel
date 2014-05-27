package extensions

import common._
import common.SCState._
import common.SCState.SCState
import org.slf4j.LoggerFactory
import common.SCState.SCState
import common.SCState
import common.LifecycleElement

/**
 * Created by felix on 28.04.14.
 */
class Hadoop (env : { val shell: Shell
                      val hdfs: HDFS}) extends SystemComponent{

  // describes the lifecycle of this system
  private val lifecycle: List[SCState]  = List(init, stop)
  private val logger = LoggerFactory.getLogger(this.getClass)

  val  getLifecycle: List[LifecycleElement] = for {lc <- lifecycle} yield LifecycleElement(lc, this.hashCode())


  def setup() {
    logger.info("starting hadoop setup")

  }

  def tearDown() {
    println("tearing down hadoop...")
    //env.shell.execute("rm -r  /home/felix/IdeaProjects/fab-framework/fab-common/src/main/resources/hadoop-2.2.0")
  }

  def update(e: ExpEvent) = {

  }
}




