fun main(args: Array<String>) {
    val lampadaSala = LampadaInteligente("Lâmpada da Sala")
    val lampadaBanheiro = LampadaInteligente("Lâmpada do Banheiro")

    val ligarLampadaSalaCommand = LampadaInteligenteCommand(lampadaSala)
    val ligarLampadaBanheiroCommand = LampadaInteligenteCommand(lampadaBanheiro)
    val casaInteligenteInvoker = CasaInteligenteInvoker()

    casaInteligenteInvoker.adicionarComando("btn-1", ligarLampadaSalaCommand)
    casaInteligenteInvoker.adicionarComando("luz-banheiro", ligarLampadaBanheiroCommand)
    casaInteligenteInvoker.executarComando("btn-1")
    casaInteligenteInvoker.desfazerComando("btn-1")
    casaInteligenteInvoker.executarComando("luz-banheiro")
}