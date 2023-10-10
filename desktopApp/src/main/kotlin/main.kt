import com.example.noncommonapiissue.Greeting
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingUtilities
import javax.swing.WindowConstants

fun main() = SwingUtilities.invokeLater {
    val window = JFrame()
    window.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    window.setSize(400, 300)
    val label = JLabel()
    label.text = Greeting().greet()
    window.add(label)
    window.isVisible = true
}
