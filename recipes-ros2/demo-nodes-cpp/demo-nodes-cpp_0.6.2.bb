# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ nodes which were previously in the ros2/examples repository but are now just used for demo purposes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake example-interfaces launch-ros rclcpp rcutils rmw rmw-implementation-cmake std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/demo_nodes_cpp/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4112d64d42e601c7e10f266881fde944"
SRC_URI[sha256sum] = "5def106eb042cfb5259c31fac8c3a80da34a4949ea5f731fd4907f3606df812f"
S = "${WORKDIR}/demos-release-release-crystal-demo_nodes_cpp-0.6.2-0"

inherit catkin
