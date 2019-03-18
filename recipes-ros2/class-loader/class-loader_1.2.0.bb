# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The class_loader package is a ROS-independent package for loading plugins during runtime and the foundation of the higher level ROS &quot;pluginlib&quot; library.     class_loader utilizes the host operating system's runtime loader to open runtime libraries (e.g. .so/.dll files), introspect the library for exported plugin classes, and allows users to instantiate objects of these exported classes without the explicit declaration (i.e. header file) for those classes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " console-bridge-vendor console-bridge poco poco-vendor"
SRC_URI = "https://github.com/ros2-gbp/class_loader-release/archive/release/crystal/class_loader/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d81eaf9b56664f55879326a49abc954"
SRC_URI[sha256sum] = "eb449f54bbf1fe37e38580e83446b523eb5891f4e187acd4fbce4ec3033c0c56"
S = "${WORKDIR}/class_loader-release-release-crystal-class_loader-1.2.0-0"

inherit ament
