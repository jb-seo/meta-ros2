# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C++ interfaces for RTI Connext."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "connext-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface rti-connext-dds-5.3.1"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/bouncy/rosidl_typesupport_connext_cpp/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e52b13e207c96fc8120f697490619ddd"
SRC_URI[sha256sum] = "3123a319e8cfdf15771540723fb9db691c82a30f7da52115dd806e6c950b4bc5"
S = "${WORKDIR}/rosidl_typesupport_connext-release-release-bouncy-rosidl_typesupport_connext_cpp-0.5.3-0"


inherit ros
inherit ament

