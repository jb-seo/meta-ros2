# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the type support for C++ messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros poco poco-vendor rmw-implementation rosidl-generator-c rosidl-typesupport-c rosidl-typesupport-connext-cpp rosidl-typesupport-interface rosidl-typesupport-introspection-cpp rosidl-typesupport-opensplice-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport-release/archive/release/crystal/rosidl_typesupport_cpp/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7cf0e37c2a0f902caa748baeb27eadb7"
SRC_URI[sha256sum] = "6e030a0b09c8f3b5fc2e7a73331f333cb3108b7ffd2dcfdb1e48b4cdf05cf04a"
S = "${WORKDIR}/rosidl_typesupport-release-release-crystal-rosidl_typesupport_cpp-0.6.2-0"

inherit catkin
