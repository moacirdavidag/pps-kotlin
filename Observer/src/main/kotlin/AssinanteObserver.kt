class AssinanteObserver : IObserver {

    private var nome: String

    constructor(nome: String) {
        this.nome = nome
    }

    override fun atualizar(algo: Any) {
        println("Olá, ${this.nome}! Há uma nova notícia: ${algo}")
    }
}