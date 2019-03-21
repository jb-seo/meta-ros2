# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ nodes which access the native handles of the rmw implemenation."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclcpp rmw-fastrtps-cpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/demo_nodes_cpp_native/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2f59d69c802ca4de852ad46dfdff5e8"
SRC_URI[sha256sum] = "a425d5dfe41855f076e9a6f2327de6a1273d77acecd60ff53ed94b9ed4404d12"
S = "${WORKDIR}/demos-release-release-bouncy-demo_nodes_cpp_native-0.5.1-1"

inherit ros
inherit ament


