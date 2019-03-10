# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the message type support for dynamic message construction in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface rosidl-typesupport-introspection-c"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_typesupport_introspection_cpp/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a4322d3ef41cfe1981a6cf12f1807d5"
SRC_URI[sha256sum] = "8c5d625a6f4d27ff0082cbfcfaf4409592d42a01ac99275d604be9bc893b6830"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_typesupport_introspection_cpp-0.6.3-0"

inherit catkin
