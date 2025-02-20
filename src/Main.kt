

interface Notificable{
    fun enviarNotificacion()
}

fun main() {
    val notificaciones: List<Notificable> = listOf(
        CorreoElectronico(),
        MensajeTexto(),
        NotificacionPush()
    )

    for (notificacion in notificaciones) {
        println(notificacion.enviarNotificacion())
    }
}