# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the type support for C messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "poco-vendor rmw-implementation rosidl-generator-c rosidl-typesupport-connext-c rosidl-typesupport-interface rosidl-typesupport-introspection-c rosidl-typesupport-opensplice-c poco"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport-release/archive/release/bouncy/rosidl_typesupport_c/0.5.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b2929a8fd556071fd6f31e9fe7106885"
SRC_URI[sha256sum] = "b1dc43774ca1946d8d2a48553eff7bb5461caa1adb167c058f1c2f485260aeae"
S = "${WORKDIR}/rosidl_typesupport-release-release-bouncy-rosidl_typesupport_c-0.5.0-2"


inherit ros
inherit ament

