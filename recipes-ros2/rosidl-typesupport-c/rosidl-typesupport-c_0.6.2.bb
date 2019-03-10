# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the type support for C messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros poco poco-vendor rmw-implementation rosidl-generator-c rosidl-typesupport-connext-c rosidl-typesupport-interface rosidl-typesupport-introspection-c rosidl-typesupport-opensplice-c"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport-release/archive/release/crystal/rosidl_typesupport_c/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2efc5c1cb6ac26c2c99fb9ceaf0e9d87"
SRC_URI[sha256sum] = "199eac548b89b254b7ad7536bfa8c72176af21f0ac85623d407c0b3286f0df78"
S = "${WORKDIR}/rosidl_typesupport-release-release-crystal-rosidl_typesupport_c-0.6.2-0"

inherit catkin
