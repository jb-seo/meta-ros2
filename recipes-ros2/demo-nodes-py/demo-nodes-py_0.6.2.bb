# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python nodes which were previously in the ros2/examples repository but are now just used for demo purposes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/demo_nodes_py/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4537146c015c133b91496df61fdd197"
SRC_URI[sha256sum] = "cc1e237a66ebe61ff40c27723c53672c42ebc6afc8f292e422d648b60c394af5"
S = "${WORKDIR}/demos-release-release-crystal-demo_nodes_py-0.6.2-0"

inherit catkin
