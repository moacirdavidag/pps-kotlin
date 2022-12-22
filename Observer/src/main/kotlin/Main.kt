fun main() {
    val jornalDeMarizopolis = JornalObservavel()
    val assinanteMoacir = AssinanteObservador()
    val assinanteFernanda = AssinanteObservador()

    assinanteMoacir.nome = "Moacir"
    assinanteFernanda.nome = "Fernanda"

    jornalDeMarizopolis.adicionarObservadores(assinanteMoacir)
    jornalDeMarizopolis.adicionarObservadores(assinanteFernanda)
    jornalDeMarizopolis.adicionarNoticia("Marizópolis tem chuva de 60mm em 24h")

}