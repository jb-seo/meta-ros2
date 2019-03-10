# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using PrismTech OpenSplice static code generation in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake libopensplice69 opensplice-cmake-module rcutils rmw rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-generator-dds-idl rosidl-typesupport-opensplice-c rosidl-typesupport-opensplice-cpp"
SRC_URI = "https://github.com/ros2-gbp/rmw_opensplice-release/archive/release/crystal/rmw_opensplice_cpp/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d0b0daf66b110d1dcbeec8bfd3fc730f"
SRC_URI[sha256sum] = "6d86a8b9e2e0aab9e2a58fd3eec8c9463dba0a95e21bae0ea5a9aeb9b03737d6"
S = "${WORKDIR}/rmw_opensplice-release-release-crystal-rmw_opensplice_cpp-0.6.3-0"

inherit catkin
