# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " nav2-costmap-2d nav2-msgs nav2-util rclcpp tf2-ros"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_world_model/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65b0bc895d2ac2cd43414ea3f5f8e27e"
SRC_URI[sha256sum] = "93f0892afe0da26c3273e874a3de6b05bd2244b469649aa76f6b5b2c9f8947c1"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_world_model-0.1.5-0"

inherit ament
