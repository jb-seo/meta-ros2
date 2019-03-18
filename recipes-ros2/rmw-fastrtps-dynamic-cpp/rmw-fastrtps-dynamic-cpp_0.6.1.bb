# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using eProsima FastRTPS  static code generation in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rcutils rmw rmw-fastrtps-shared-cpp rosidl-generator-c rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/crystal/rmw_fastrtps_dynamic_cpp/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "356829c13a98f3126d7779e896d4df4e"
SRC_URI[sha256sum] = "3a7aad477337f30a390ae9c592f26c92327773e7aea2e4955926b29b014439f3"
S = "${WORKDIR}/rmw_fastrtps-release-release-crystal-rmw_fastrtps_dynamic_cpp-0.6.1-0"

inherit ament
