# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C++ interfaces for RTI Connext."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " connext-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/crystal/rosidl_typesupport_connext_cpp/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de02b8e6532212fe092bb40a55532a35"
SRC_URI[sha256sum] = "7a65e6e25646ea08557082d0ca4435958a2f09ff8670d6234342c244e1c2b682"
S = "${WORKDIR}/rosidl_typesupport_connext-release-release-crystal-rosidl_typesupport_connext_cpp-0.6.4-0"

inherit ament


