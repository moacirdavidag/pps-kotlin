interface IObservable {
    fun adicionarObservador(observador: IObserver)
    fun removerObservador(observador: IObserver)
    fun notificar(algo: Any)
}