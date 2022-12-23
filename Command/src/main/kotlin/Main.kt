fun main(args: Array<String>) {

    var lampadaDaSala = LampadaInteligente("Lâmpada da Sala")
    var lampadaDoBanheiro = LampadaInteligente("Lâmpada do Banheiro")

    var ligarLampadaSalaCommand = LampadaInteligenteCommand(lampadaDaSala)
    var ligarLampadaBanheiroCommand = LampadaInteligenteCommand(lampadaDoBanheiro)

    var lampadaInteligenteInvoker = LampadaInteligenteInvoker()

    lampadaInteligenteInvoker.adicionarComando("ligar-luz-sala", ligarLampadaSalaCommand)
    lampadaInteligenteInvoker.adicionarComando("ligar-luz-banheiro", ligarLampadaBanheiroCommand)

    lampadaInteligenteInvoker.executarComando("ligar-luz-sala")
    lampadaInteligenteInvoker.desfazerComando("ligar-luz-sala")

    lampadaInteligenteInvoker.executarComando("ligar-luz-banheiro")
    lampadaInteligenteInvoker.desfazerComando("ligar-luz-banheiro")

}