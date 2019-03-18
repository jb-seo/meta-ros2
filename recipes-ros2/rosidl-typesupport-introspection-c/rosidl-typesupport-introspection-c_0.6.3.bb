# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the message type support for dynamic message construction in C."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rosidl-cmake rosidl-generator-c rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_typesupport_introspection_c/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c7c79ef5494b4d91134754a2bfc54634"
SRC_URI[sha256sum] = "23fc3046491d1816be15edcd3a210ee401c3efef2b6030efe82dbd2fee1fa783"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_typesupport_introspection_c-0.6.3-0"

inherit ament


