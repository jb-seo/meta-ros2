# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage aggregating the turtlebot2 demo packages"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "depthimage-to-pointcloud2 turtlebot2-amcl turtlebot2-cartographer turtlebot2-drivers turtlebot2-follower turtlebot2-teleop"
SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_demo/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6a09960b80a834284fc1896eada1ff88"
SRC_URI[sha256sum] = "ab842dc1c6a516d94035de7b97d1a356e1a9e9b93dab6af8ac91b6c48e1c1954"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_demo-0.5.1-0"

inherit ros
inherit ament


