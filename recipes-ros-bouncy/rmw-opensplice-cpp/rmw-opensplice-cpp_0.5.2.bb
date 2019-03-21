# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using PrismTech OpenSplice static code generation in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "opensplice-cmake-module rcutils rmw rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-generator-dds-idl rosidl-typesupport-opensplice-c rosidl-typesupport-opensplice-cpp libopensplice67"
SRC_URI = "https://github.com/ros2-gbp/rmw_opensplice-release/archive/release/bouncy/rmw_opensplice_cpp/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "151d1ae792fa823f85da4a02a676381d"
SRC_URI[sha256sum] = "d9375a7d0b12ab96bff22cd17f68cc8e692e70cd20358f9317aa952f862bad9b"
S = "${WORKDIR}/rmw_opensplice-release-release-bouncy-rmw_opensplice_cpp-0.5.2-0"

inherit ros
inherit ament


