package a.f.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

@l(dWo = {1, 1, 13}, dWp = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, dWq = {"Lkotlin/jvm/internal/ArrayIterator;", "T", "", "array", "", "([Ljava/lang/Object;)V", "getArray", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "index", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
final class a<T> implements a.f.b.a.a, Iterator<T> {
    private final T[] AVv;
    private int index;

    public final void remove() {
        AppMethodBeat.i(56242);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        AppMethodBeat.o(56242);
        throw unsupportedOperationException;
    }

    public a(T[] tArr) {
        j.p(tArr, "array");
        AppMethodBeat.i(56241);
        this.AVv = tArr;
        AppMethodBeat.o(56241);
    }

    public final boolean hasNext() {
        return this.index < this.AVv.length;
    }

    public final T next() {
        AppMethodBeat.i(56240);
        try {
            Object[] objArr = this.AVv;
            int i = this.index;
            this.index = i + 1;
            T t = objArr[i];
            AppMethodBeat.o(56240);
            return t;
        } catch (ArrayIndexOutOfBoundsException e) {
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = e;
            this.index--;
            Throwable noSuchElementException = new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
            AppMethodBeat.o(56240);
            throw noSuchElementException;
        }
    }
}
