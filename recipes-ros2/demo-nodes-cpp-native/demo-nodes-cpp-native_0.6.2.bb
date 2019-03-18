# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ nodes which access the native handles of the rmw implemenation."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rclcpp rmw-fastrtps-cpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/demo_nodes_cpp_native/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b5bd4e63888018951c82803595c40bb0"
SRC_URI[sha256sum] = "3a7bbe8783baab74faa5bfc7f49cc90e4ffa199f6cde8b83dcdf0146dcc0f5fe"
S = "${WORKDIR}/demos-release-release-crystal-demo_nodes_cpp_native-0.6.2-0"

inherit ament
