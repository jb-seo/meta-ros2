# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using RTI Connext static code generation in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "connext-cmake-module rcutils rmw rmw-connext-shared-cpp rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-generator-dds-idl rosidl-typesupport-connext-c rosidl-typesupport-connext-cpp rti-connext-dds-5.3.1"
SRC_URI = "https://github.com/ros2-gbp/rmw_connext-release/archive/release/bouncy/rmw_connext_cpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4d0ade8ec98f42c5fc1c9bcaa1e02bb"
SRC_URI[sha256sum] = "69f9a58918680b5abae73562066f59496880033ba464bcd0535b52eecaa4949a"
S = "${WORKDIR}/rmw_connext-release-release-bouncy-rmw_connext_cpp-0.5.1-0"


inherit ros
inherit ament

