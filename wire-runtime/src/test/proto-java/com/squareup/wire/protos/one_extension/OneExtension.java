// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/one_extension.proto at 20:1
package com.squareup.wire.protos.one_extension;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class OneExtension extends Message<OneExtension> {
  public static final ProtoAdapter<OneExtension> ADAPTER = ProtoAdapter.newMessageAdapter(OneExtension.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ID = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String id;

  @WireField(
      tag = 1000,
      adapter = "com.squareup.wire.protos.one_extension.Foo#ADAPTER"
  )
  public final Foo foo;

  public OneExtension(String id, Foo foo) {
    this(id, foo, TagMap.EMPTY);
  }

  public OneExtension(String id, Foo foo, TagMap tagMap) {
    super(tagMap);
    this.id = id;
    this.foo = foo;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OneExtension)) return false;
    OneExtension o = (OneExtension) other;
    return equals(tagMap(), o.tagMap())
        && equals(id, o.id)
        && equals(foo, o.foo);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (foo != null ? foo.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<OneExtension, Builder> {
    public String id;

    public Foo foo;

    public Builder() {
    }

    public Builder(OneExtension message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.foo = message.foo;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder foo(Foo foo) {
      this.foo = foo;
      return this;
    }

    @Override
    public OneExtension build() {
      return new OneExtension(id, foo, buildTagMap());
    }
  }
}
