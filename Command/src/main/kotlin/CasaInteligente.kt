class CasaInteligente {

    val lampadaSala = LampadaInteligente("Lâmpada Sala")
    val lampadaBanheiro = LampadaInteligente("Lâmpada Banheiro")

    val ligarLampadaCommand = LampadaInteligenteCommand(lampadaSala)

    val invoker = CasaInteligenteInvoker()

}