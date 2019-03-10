# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library which provides the 3D rendering functionality in rviz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-index-cpp eigen libqt5-core libqt5-gui libqt5-opengl libqt5-widgets qtbase5-dev resource-retriever rviz-assimp-vendor rviz-ogre-vendor"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_rendering/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "55cf73f4864791b989a18a5520897c30"
SRC_URI[sha256sum] = "96086e823a93382820f721d1ef80ed07afdef6a433d8d5bff33265ae9407b528"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_rendering-5.1.0-0"

inherit catkin
