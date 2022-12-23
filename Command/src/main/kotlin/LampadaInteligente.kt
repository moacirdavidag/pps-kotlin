class LampadaInteligente {
    private var isLigada: Boolean = false

    private var nome: String
    constructor(nome: String) {
        this.nome = nome
    }

    fun ligar(): Boolean {
        this.isLigada = true
        return isLigada
    }

    fun desligar(): Boolean {
        this.isLigada = false
        return isLigada
    }

    fun getEstadoLampada() : String {
        if(isLigada) {
            return "Ligada"
        }
        return "Desligada"
    }

}