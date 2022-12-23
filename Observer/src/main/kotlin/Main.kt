fun main(args: Array<String>) {
    var jornalDoBrasil = JornalObservable()

    var moacir = AssinanteObserver("Moacir")
    var fernanda = AssinanteObserver("Fernanda")
    var carlos = AssinanteObserver("Carlos")

    jornalDoBrasil.adicionarObservador(moacir)
    jornalDoBrasil.adicionarObservador(fernanda)
    jornalDoBrasil.adicionarObservador(carlos)

    jornalDoBrasil.adicionarNoticia("Brasil sai da sexta posição em população mundial!")
    jornalDoBrasil.adicionarNoticia("Brasil é o maior país da América Latina")

}