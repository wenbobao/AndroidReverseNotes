package p000a.p001a;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p000a.C0220l;
import p000a.p005f.p007b.C25052j;
import p000a.p005f.p007b.p1144a.C41374a;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, dWq = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"})
/* renamed from: a.a.b */
public abstract class C0002b<E> extends C36921a<E> implements C41374a, List<E> {
    public static final C0005a AUC = new C0005a();

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, dWq = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: a.a.b$b */
    class C0003b implements C41374a, Iterator<E> {
        int index;

        public void remove() {
            AppMethodBeat.m2504i(56070);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
            AppMethodBeat.m2505o(56070);
            throw unsupportedOperationException;
        }

        public boolean hasNext() {
            AppMethodBeat.m2504i(56068);
            if (this.index < C0002b.this.size()) {
                AppMethodBeat.m2505o(56068);
                return true;
            }
            AppMethodBeat.m2505o(56068);
            return false;
        }

        public E next() {
            AppMethodBeat.m2504i(56069);
            if (hasNext()) {
                C0002b c0002b = C0002b.this;
                int i = this.index;
                this.index = i + 1;
                Object obj = c0002b.get(i);
                AppMethodBeat.m2505o(56069);
                return obj;
            }
            Throwable noSuchElementException = new NoSuchElementException();
            AppMethodBeat.m2505o(56069);
            throw noSuchElementException;
        }
    }

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, dWq = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"})
    /* renamed from: a.a.b$c */
    class C0004c extends C0003b implements C41374a, ListIterator<E> {
        public final void add(E e) {
            AppMethodBeat.m2504i(56180);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
            AppMethodBeat.m2505o(56180);
            throw unsupportedOperationException;
        }

        public final void set(E e) {
            AppMethodBeat.m2504i(56181);
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
            AppMethodBeat.m2505o(56181);
            throw unsupportedOperationException;
        }

        public C0004c(int i) {
            super();
            AppMethodBeat.m2504i(56179);
            C0005a c0005a = C0002b.AUC;
            int size = C0002b.this.size();
            if (i < 0 || i > size) {
                Throwable indexOutOfBoundsException = new IndexOutOfBoundsException("index: " + i + ", size: " + size);
                AppMethodBeat.m2505o(56179);
                throw indexOutOfBoundsException;
            }
            this.index = i;
            AppMethodBeat.m2505o(56179);
        }

        public final E previous() {
            AppMethodBeat.m2504i(56178);
            if (hasPrevious()) {
                C0002b c0002b = C0002b.this;
                this.index--;
                Object obj = c0002b.get(this.index);
                AppMethodBeat.m2505o(56178);
                return obj;
            }
            Throwable noSuchElementException = new NoSuchElementException();
            AppMethodBeat.m2505o(56178);
            throw noSuchElementException;
        }

        public final boolean hasPrevious() {
            return this.index > 0;
        }

        public final int nextIndex() {
            return this.index;
        }

        public final int previousIndex() {
            return this.index - 1;
        }
    }

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000¢\u0006\u0002\b\u0016¨\u0006\u0017"}, dWq = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"})
    /* renamed from: a.a.b$a */
    public static final class C0005a {
        private C0005a() {
        }

        public /* synthetic */ C0005a(byte b) {
            this();
        }
    }

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, dWq = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: a.a.b$d */
    static final class C0006d<E> extends C0002b<E> implements RandomAccess {
        private int AUE;
        private final C0002b<E> AUF;
        private final int AUG;

        public C0006d(C0002b<? extends E> c0002b, int i, int i2) {
            C25052j.m39376p(c0002b, "list");
            AppMethodBeat.m2504i(56205);
            this.AUF = c0002b;
            this.AUG = i;
            int i3 = this.AUG;
            int size = this.AUF.size();
            Throwable indexOutOfBoundsException;
            if (i3 < 0 || i2 > size) {
                indexOutOfBoundsException = new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i2 + ", size: " + size);
                AppMethodBeat.m2505o(56205);
                throw indexOutOfBoundsException;
            } else if (i3 > i2) {
                indexOutOfBoundsException = new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i2);
                AppMethodBeat.m2505o(56205);
                throw indexOutOfBoundsException;
            } else {
                this.AUE = i2 - this.AUG;
                AppMethodBeat.m2505o(56205);
            }
        }

        public final E get(int i) {
            AppMethodBeat.m2504i(56204);
            int i2 = this.AUE;
            if (i < 0 || i >= i2) {
                Throwable indexOutOfBoundsException = new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
                AppMethodBeat.m2505o(56204);
                throw indexOutOfBoundsException;
            }
            Object obj = this.AUF.get(this.AUG + i);
            AppMethodBeat.m2505o(56204);
            return obj;
        }

        public final int getSize() {
            return this.AUE;
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected C0002b() {
    }

    public Iterator<E> iterator() {
        return new C0003b();
    }

    public ListIterator<E> listIterator() {
        return new C0004c(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C0004c(i);
    }

    public List<E> subList(int i, int i2) {
        return new C0006d(this, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection<Object> collection = this;
        Collection collection2 = (Collection) obj;
        C25052j.m39376p(collection, "c");
        C25052j.m39376p(collection2, FacebookRequestErrorClassification.KEY_OTHER);
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator it = collection2.iterator();
        for (Object j : collection) {
            if ((C25052j.m39373j(j, it.next()) ^ 1) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Collection collection = this;
        C25052j.m39376p(collection, "c");
        int i = 1;
        for (Object next : collection) {
            i = (next != null ? next.hashCode() : 0) + (i * 31);
        }
        return i;
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object j : this) {
            if (C25052j.m39373j(j, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C25052j.m39373j(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
