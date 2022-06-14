package com.example.model;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Group(Constants.GROUP)
@Version(Constants.VERSION)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = Constants.K8S_PACKAGE, refs = {
        @BuildableReference(CustomResource.class)
})
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MyResource extends CustomResource<MySpec, MyStatus> implements Namespaced {
}
