# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common rviz API, used by rviz plugins and applications."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs pluginlib rclcpp resource-retriever rviz-assimp-vendor rviz-ogre-vendor rviz-rendering rviz-yaml-cpp-vendor sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tinyxml-vendor urdf libqt5-core libqt5-gui libqt5-opengl libqt5-widgets qtbase5-dev"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_common/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c1a686805060a219b5e106191d7dd151"
SRC_URI[sha256sum] = "b353e9b7b78facc8c0ab45b45b62915f0ce578b29d6f3aba1d366c16ded3b810"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_common-4.0.2-0"


inherit ros
inherit ament

