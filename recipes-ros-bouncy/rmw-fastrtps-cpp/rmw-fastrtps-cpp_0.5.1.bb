# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using eProsima FastRTPS  static code generation in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros fastcdr fastrtps fastrtps-cmake-module rcutils rmw rosidl-generator-c rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/bouncy/rmw_fastrtps_cpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff5f229687e609eccdabbaa8a86c3027"
SRC_URI[sha256sum] = "3a07c77359da1db06685392961c5cecebba9297febfc442368a6c07f3f5d2cc0"
S = "${WORKDIR}/rmw_fastrtps-release-release-bouncy-rmw_fastrtps_cpp-0.5.1-0"

inherit catkin
