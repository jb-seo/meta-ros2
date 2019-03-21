# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C interfaces for RTI Connext."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "connext-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-parser rosidl-typesupport-connext-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/bouncy/rosidl_typesupport_connext_c/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "500fb269779882bcc178459037141b03"
SRC_URI[sha256sum] = "81fb3449ded1f2470170830951e5f1c0978d8e20dcd61300a5fff19a1a81d5ca"
S = "${WORKDIR}/rosidl_typesupport_connext-release-release-bouncy-rosidl_typesupport_connext_c-0.5.3-0"

inherit ros
inherit ament


