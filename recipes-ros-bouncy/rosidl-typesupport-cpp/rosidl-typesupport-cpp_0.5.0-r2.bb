# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the type support for C++ messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "poco-vendor rmw-implementation rosidl-generator-c rosidl-typesupport-c rosidl-typesupport-connext-cpp rosidl-typesupport-interface rosidl-typesupport-introspection-cpp rosidl-typesupport-opensplice-cpp poco"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport-release/archive/release/bouncy/rosidl_typesupport_cpp/0.5.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "219e2df46038df4c399a418610e44781"
SRC_URI[sha256sum] = "744fa2251aa4b6aaf0038977af58657fa4ed1e17f5c7ca70aac909821135b39d"
S = "${WORKDIR}/rosidl_typesupport-release-release-bouncy-rosidl_typesupport_cpp-0.5.0-2"


inherit ros
inherit ament

