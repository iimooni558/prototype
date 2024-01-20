// Generated by view binder compiler. Do not edit!
package com.destination.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.destination.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final TextView textView5;

  private ContentHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout container,
      @NonNull ImageView imageView3, @NonNull ImageView imageView5, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.container = container;
    this.imageView3 = imageView3;
    this.imageView5 = imageView5;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new ContentHomeBinding((ConstraintLayout) rootView, constraintLayout, container,
          imageView3, imageView5, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
