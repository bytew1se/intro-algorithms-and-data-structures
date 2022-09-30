// import scala.actors._ 
// import scala.actors.Actor._

package shapes {

    object ShapeDrawingActor{ 
        def act() = 
            loop { 
                receive {
                    case s: Shape => s.draw()
                    case"exit" =>println("exiting...");
                    exit 
                    case x:Any =>println("Error:Unknownmessage!"+x)
                } 
            }
    }
}